package com.yurnero.particle.framework.actions.effect

import com.yurnero.particle.framework.actions.effect.model.Target
import com.yurnero.particle.framework.component.Modifier
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class ChangeModifierEffect(
    var target: Target,
    var modifier: Modifier? = null
)
