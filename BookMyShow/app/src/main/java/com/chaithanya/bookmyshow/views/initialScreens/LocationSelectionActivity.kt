package com.chaithanya.bookmyshow.views.initialScreens

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.chaithanya.bookmyshow.databinding.ActivityLocationSelectionBinding
import com.chaithanya.bookmyshow.model.Response
import com.chaithanya.bookmyshow.model.ResponseItem
import com.chaithanya.bookmyshow.views.adapters.CityAdapter
import com.chaithanya.bookmyshow.views.interfaces.OnCityClickListener
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.InputStream
import java.lang.reflect.Type


class LocationSelectionActivity : AppCompatActivity(), OnCityClickListener {

    lateinit var binding: ActivityLocationSelectionBinding


    lateinit var cityAdapter: CityAdapter
    private var cityItemList = arrayListOf<ResponseItem>()

    private var context:OnCityClickListener = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.IO).launch {
            getDataFromJSON()
        }

    }

    private fun getDataFromJSON() {
        var inputStream: InputStream? = null
        try {
            inputStream = assets.open("cities.json")
            var data: Int = inputStream.read()
            val stringBuffer = StringBuffer()
            while (data != -1) {
                val ch = data.toChar()
                stringBuffer.append(ch)
                data = inputStream.read()
            }
            buildPOJOFromJSON(stringBuffer.toString())
        } catch (e: Exception) {
            Log.d("Tag", e.message!!)
        }
    }

    private fun buildPOJOFromJSON(json: String) {
        val gson = Gson()
//        val type: Type = object : TypeToken<ResponseItem>(){}.type
        val responseModel: Response = gson.fromJson(json, Response::class.java)
        setData(responseModel)
    }

    private fun setData(responseModel: Response) {
        cityItemList = responseModel.response as ArrayList<ResponseItem>
        CoroutineScope(Dispatchers.Main).launch {
            cityAdapter = CityAdapter(cityItemList, context)
            binding.rvCities.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = cityAdapter
            }
        }
    }

    override fun onItemClicked(cityItem: ResponseItem) {

    }
}