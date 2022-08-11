package com.yurnero.sdui.framework.component.basic

import com.yurnero.sdui.framework.actions.Action
import com.yurnero.sdui.framework.component.Modifier
import com.yurnero.sdui.framework.component.basic.text.TextField
import com.yurnero.sdui.framework.component.basic.text.TextView
import kotlinx.serialization.Serializable


/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Component(
    val id: String,
    val modifier: Modifier? = null,
    val actions: MutableList<Action> = mutableListOf(),
    val horizontalStack: HorizontalStack? = null,
    val verticalStack: VerticalStack? = null,
    val textView: TextView? = null,
    val button: Button? = null,
    val textField: TextField? = null,
    val draw: Draw? = null
)
