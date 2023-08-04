package com.example.deneme

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class FavActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fav_layout) // Layout dosyasını belirtin




        val favArrayList = ArrayList<String>()

// Butonun tıklama olayını belirle
        imgfavbtn.setOnClickListener {
            // TextView'dan veriyi al
            val veri = tvsehir.text.toString()

            if (favArrayList.size < 3) {
                // Veriyi ArrayList'e ekle
                favArrayList.add(veri)
                Toast.makeText(this, "Veri eklendi: $veri", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Maksimum veri sayısına ulaşıldı. Veri eklenemiyor.", Toast.LENGTH_SHORT).show()
            }
        }

// Sil butonunun tıklama olayını belirle
        imgnotfavbtn.setOnClickListener {
            val silinecekVeri = tvsehir.text.toString()

            if (favArrayList.contains(silinecekVeri)) {
                // Veriyi ArrayList'ten sil
                favArrayList.remove(silinecekVeri)
                Toast.makeText(this, "Veri silindi: $silinecekVeri", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "ArrayList'te böyle bir veri bulunamadı.", Toast.LENGTH_SHORT).show()
            }
        }


        cvfavoriler1.setOnClickListener{
            val intent = Intent(this, FavActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Favoriler 1 cardview'a tıklandı $tv2fav1", Toast.LENGTH_SHORT).show()

        }

        cvfavoriler2.setOnClickListener{

            val intent = Intent(this, FavActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Favoriler 2 cardview'a tıklandı $tv2fav2", Toast.LENGTH_SHORT).show()

        }

        cvfavoriler3.setOnClickListener{
            val intent = Intent(this, FavActivity::class.java)
            startActivity(intent)

            Toast.makeText(this, "Favoriler 3 cardview'a tıklandı $tv2fav3", Toast.LENGTH_SHORT).show()

        }




    }
}