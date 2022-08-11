package com.yurnero.sc.framework.component.basic

import com.yurnero.sc.framework.actions.Action
import com.yurnero.sc.framework.component.Modifier
import com.yurnero.sc.framework.component.basic.text.TextField
import com.yurnero.sc.framework.component.basic.text.TextView
import kotlinx.serialization.Serializable


/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Component(
    var id: String,
    var modifier: Modifier? = null,
    var actions: MutableList<Action> = mutableListOf(),
    var horizontalStack: HorizontalStack? = null,
    var verticalStack: VerticalStack? = null,
    var textView: TextView? = null,
    var button: Button? = null,
    var textField: TextField? = null,
    var draw: Draw? = null
)
