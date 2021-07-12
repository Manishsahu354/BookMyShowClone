package com.chaithanya.bookmyshow.ui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.constant.Constants.RAZORPAY_ID
import com.chaithanya.bookmyshow.databinding.FragmentPaymentEventBinding
import com.razorpay.Checkout
import org.json.JSONObject


class PaymentEventFragment : Fragment() {

//    private val args by navArgs<PaymentEventFragmentArgs>()
    private var _binding: FragmentPaymentEventBinding? = null
    private val binding get() = _binding!!

    private var value = 1
    private var price = 0
    private var totalPrice = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPaymentEventBinding.inflate(inflater, container, false)

//        Checkout.preload(activity?.applicationContext)
//
//        binding.eventTitle.text = args.event.title
//
//        price = args.event.price!!.toInt()
//
//        binding.imageBack.setOnClickListener {
//            findNavController().popBackStack()
//        }
//
//        binding.tvEntryPrice.text = "₹ $price"
//        binding.btnIncrease.setOnClickListener {
//            value++
//            check()
//        }
//
//        binding.btnReduce.setOnClickListener {
//            value--
//            check()
//        }
//
//        binding.btnProceed.setOnClickListener {
//            startPayment()
//        }
//
//        check()
        return binding.root
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
        co.setKeyID(RAZORPAY_ID)

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
            co.open(requireActivity(),options)

        }catch (e: Exception){
            Toast.makeText(requireContext(),"Error in payment: "+ e.message, Toast.LENGTH_LONG).show()
            e.printStackTrace()
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}