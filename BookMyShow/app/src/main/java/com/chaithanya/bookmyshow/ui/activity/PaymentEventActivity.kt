package com.chaithanya.bookmyshow.ui.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.navArgs
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.constant.Constants
import com.chaithanya.bookmyshow.databinding.ActivityPaymentEventBinding
import com.razorpay.Checkout
import com.razorpay.PaymentResultListener
import org.json.JSONObject

class PaymentEventActivity : AppCompatActivity(),PaymentResultListener {

    private val args by navArgs<PaymentEventActivityArgs>()

    private var value = 1
    private var price = 0
    private var totalPrice = 0

    private lateinit var binding:ActivityPaymentEventBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentEventBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Checkout.preload(this)

        binding.eventTitle.text = args.events.title

        if(args.events.free!! == "false"){
            price = args.events.price!!.toInt()
        }else{
            price = 0
        }


        binding.imageBack.setOnClickListener {
            finish()
           // Navigation.findNavController(binding.root).popBackStack()
        }

        binding.tvEntryPrice.text = "₹ $price"
        binding.btnIncrease.setOnClickListener {
            value++
            check()
        }

        binding.btnReduce.setOnClickListener {
            value--
            check()
        }

        binding.btnProceed.setOnClickListener {
            if (price != 0){
                startPayment()
            }else{
                goTicketBookedActivity()
            }

        }

        check()
    }

    @SuppressLint("ResourceAsColor")
    private fun check(){


        binding.tvCount.text = value.toString()
        totalPrice = price * value
        binding.eventPrice.text = "₹ $totalPrice"

        when (value) {
            1 -> {
                binding.btnReduce.isClickable = false
                binding.btnReduce.setImageResource(R.drawable.ic_minus_grey)
                binding.btnIncrease.isClickable = true
            }
            5 -> {
                binding.btnIncrease.isClickable = false
                binding.btnReduce.isClickable = true
                binding.btnIncrease.setImageResource(R.drawable.ic_plus_grey)
            }
            else -> {
                binding.btnIncrease.isClickable = true
                binding.btnReduce.isClickable = true
                binding.btnReduce.setImageResource(R.drawable.ic_minus)
                binding.btnIncrease.setImageResource(R.drawable.ic_plus)
            }
        }
    }


    private fun startPayment() {
        /*
        *  You need to pass current activity in order to let Razorpay create CheckoutActivity
        * */

        val co = Checkout()
        co.setKeyID(Constants.RAZORPAY_ID)

        val activity: Activity = this

        try {
            val options = JSONObject()
            options.put("name","Manish Kumar")
            options.put("description","Demoing Charges")

            //You can omit the image option to fetch the image from dashboard

            options.put("image","https://s3.amazonaws.com/rzp-mobile/images/rzp.png")
            options.put("theme.color", "#3399cc");
            options.put("currency","INR");

            //   options.put("order_id", "order_DBJOWzybf0sJbb");

            options.put("amount",totalPrice * 100)//pass amount in currency subunits

            val retryObj = JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            options.put("retry", retryObj);

            val prefill = JSONObject()
            prefill.put("email","manishsahu354@gmail.com")
            prefill.put("contact","9981886715")

            options.put("prefill",prefill)
            co.open(activity,options)

        }catch (e: Exception){
            Toast.makeText(this,"Error in payment: "+ e.message, Toast.LENGTH_LONG).show()
            e.printStackTrace()
        }
    }

    private fun goTicketBookedActivity(){
        val intent = Intent(this, PaymentSuccessfulActivity::class.java)
        intent.putExtra("eventName",args.events.title)
        intent.putExtra("date",args.events.date)
        intent.putExtra("quantity",value.toString())
        intent.putExtra("amount",totalPrice.toString())
        intent.putExtra("venue",args.events.venue)
        intent.putExtra("image",args.events.imageUrl)

        startActivity(intent)
        finish()
    }

    override fun onPaymentSuccess(p0: String?) {

        goTicketBookedActivity()

    }

    override fun onPaymentError(p0: Int, p1: String?) {

        Toast.makeText(this,"Payment Failed please Try Again",Toast.LENGTH_SHORT).show()
    }

}