import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog
import org.jetbrains.anko.toast

class SimpleAlertDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val context = context
        if (context == null)
            return super.onCreateDialog(savedInstanceState)
        val builder = AlertDialog.Builder(context).apply {
            setMessage("時間になりました！ ")
            setPositiveButton("起きる") { dialog, witch ->
                context.toast("起きるがクリックされました")
            }
            setNegativeButton("あと5分") { dialog, which ->
                context.toast("あと5分がクリックされました")
            }
        }
        return super.onCreateDialog(savedInstanceState)
    }
}