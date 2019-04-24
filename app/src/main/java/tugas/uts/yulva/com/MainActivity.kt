package tugas.uts.yulva.com

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.content.ContextCompat.startActivity





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_move_activity.setOnClickListener{
            val intent = Intent(this,MoveActivity::class.java)
            startActivity(intent)
        }
        btnbuka.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://instagram.com/_u/putri.d.yulva")
            )

            startActivity(intent)
        }
        btn_move_activity_data.setOnClickListener {
            val intent: Intent = Intent(this, MoveWithDataActivity::class.java)
            intent.putExtra("NAMA", " NAMA : YULVA WIDIYANA PUTRI")
            intent.putExtra("NPM", "NPM : 16670071")
            intent.putExtra("KELAS", "KELAS : INFORMATIKA 6B")
            intent.putExtra("FOTO", R.drawable.yulva)
            intent.putExtra("GMAIL", "GMAIL : YULVAWP26@GMAIL.COM")

            startActivity(intent)

        }

    }
}

