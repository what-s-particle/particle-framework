package com.yurnero.sc.framework.actions.effect

import com.yurnero.sc.framework.actions.Effect
import com.yurnero.sc.framework.actions.effect.model.Target
import com.yurnero.sc.framework.component.ComponentType
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
