package com.yurnero.sdui.framework.actions.effect

import com.yurnero.sdui.framework.actions.effect.model.Target
import com.yurnero.sdui.framework.component.Modifier
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class ChangeModifierEffect(
    val target: Target,
    val modifier: Modifier? = null
)
