package com.yurnero.sdui.framework.component.layout

import com.yurnero.sdui.framework.actions.Action
import com.yurnero.sdui.framework.component.modifier.Modifier
import kotlinx.serialization.Serializable


/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Component(
    val id: String,
    var modifier: Modifier? = null,
    val actions: MutableList<Action> = mutableListOf(),
    var horizontalStack: HorizontalStack? = null,
    var verticalStack: VerticalStack? = null,
    var textView: TextView? = null,
    var button: Button? = null
)
