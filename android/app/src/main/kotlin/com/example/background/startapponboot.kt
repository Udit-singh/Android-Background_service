import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.background.BackgroundService

class StartAppOnBoot : BroadcastReceiver() {
   override fun onReceive(context: Context?, intent: Intent?) {
      if (Intent.ACTION_BOOT_COMPLETED == intent!!.action) {
         val i = Intent(context, BackgroundService::class.java)
         i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
         context!!.startActivity(i)
      }
   }
}