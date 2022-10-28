package com.yurnero.particle.framework

import com.yurnero.particle.framework.actions.Action
import com.yurnero.particle.framework.component.Modifier
import com.yurnero.particle.framework.component.basic.Button
import com.yurnero.particle.framework.component.basic.Draw
import com.yurnero.particle.framework.component.basic.HorizontalStack
import com.yurnero.particle.framework.component.basic.Icon
import com.yurnero.particle.framework.component.basic.Navigation
import com.yurnero.particle.framework.component.basic.VerticalStack
import com.yurnero.particle.framework.component.basic.text.TextField
import com.yurnero.particle.framework.component.basic.text.TextView
import kotlinx.serialization.Serializable


/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Particle(
    var id: String,
    var modifier: Modifier? = null,
    var actions: MutableList<Action> = mutableListOf(),
    var horizontalStack: HorizontalStack? = null,
    var verticalStack: VerticalStack? = null,
    var textView: TextView? = null,
    var button: Button? = null,
    var textField: TextField? = null,
    var draw: Draw? = null,
    var icon: Icon? = null,
    var navigation: Navigation? = null
)
