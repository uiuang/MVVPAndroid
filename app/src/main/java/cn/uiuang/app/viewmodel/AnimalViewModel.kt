package cn.uiuang.app.viewmodel

import android.databinding.ObservableField
import cn.uiuang.app.model.Animal

/**
 * @类名称：AnimalViewModel
 * @单位：无
 * @联系人：朱世闯
 * @联系方式：18715096987@163.com
 * @创建时间：2018/10/20-12:23
 * @功能描述：
 */
class AnimalViewModel(val animal: Animal) {
    var info = ObservableField<String>("${animal.name} 叫了${animal.showCount}声")

    fun shout(){
        animal.showCount++
        info.set("${animal.name} 叫了${animal.showCount}声")

    }
}