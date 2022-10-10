package com.geektech.k1hw5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.k1hw5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
            private var count = 0
            private lateinit var result: String
            private lateinit var binding: ActivityMainBinding
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityMainBinding.inflate(layoutInflater)
                setContentView(binding.root)
                onClick()
            }

            fun onClick() {
                binding.btnOne.setOnClickListener {
                    count += 1
                    binding.TvOne.text = count.toString()
                    if (count == 10 ) {
                        binding.btnOne.text = "-1"
                        binding.btnOne.setOnClickListener {
                            count -= 1
                            binding.TvOne.text = count.toString()
                            if (count == 0) {
                                val intent = Intent(this, SecondActivity::class.java)
                                startActivity(intent)
                            }
                        }
                    }
                }
            }
        }

