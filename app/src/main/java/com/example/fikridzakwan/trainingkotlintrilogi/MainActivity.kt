package com.example.fikridzakwan.trainingkotlintrilogi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        txt_gambar.text = "Avenger = Infinity war"
//        val url = "https://duniadeena.files.wordpress.com/2018/04/mv5bzjy4ntblotmty2mzms00zwezlwi2nzutzdu3ngq0zmu3ymm2xkeyxkfqcgdeqxvynjc0mtk5mjm-_v1_.jpg"
//        Picasso.get().load(url).into(img_gambar)

        initView()

    }

    private fun initView() {
        var firtsNames = ArrayList<String>(
            Arrays.asList(*resources.getStringArray(R.array.firts_name))
        )

        var lastNames = ArrayList<String>(
            Arrays.asList(*resources.getStringArray(R.array.last_name))
        )

        var avatars = ArrayList<String>(
            Arrays.asList(*resources.getStringArray(R.array.avatar))
        )

        var viewManager = LinearLayoutManager(this)

        var viewAdapter = UserAdapter(firtsNames, lastNames, avatars)

        rv_user_list.layoutManager = viewManager

        rv_user_list.adapter = viewAdapter
    }
}
