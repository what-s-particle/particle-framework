package com.yurnero.particle.framework.actions.effect

import com.yurnero.particle.framework.actions.Effect
import com.yurnero.particle.framework.actions.effect.model.Target
import com.yurnero.particle.framework.component.ComponentType
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class UpdateComponentEffect(
    var path: String,
    var type: ComponentType,
    var target: Target,
    var successEffects: MutableList<Effect>? = mutableListOf(),
    var failedEffects: MutableList<Effect>? = mutableListOf()
)
