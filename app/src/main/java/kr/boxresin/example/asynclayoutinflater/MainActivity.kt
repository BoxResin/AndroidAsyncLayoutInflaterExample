package kr.boxresin.example.asynclayoutinflater

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.asynclayoutinflater.view.AsyncLayoutInflater

/** 메인 액티비티 */
class MainActivity : AppCompatActivity() {
    /** 메인 액티비티가 생성될 때 호출된다. */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 우선 스플래시 레이아웃을 적용한다.
        setContentView(R.layout.splash)

        // 실제 적용할 레이아웃을 비동기적으로 inflate 한다.
        val inflater = AsyncLayoutInflater(this)
        inflater.inflate(R.layout.activity_main, null) { view: View, _, _ ->
            // inflate 완료 시 수행할 작업
            setContentView(view)
        }
    }
}
