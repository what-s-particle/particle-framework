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
    val path: String,
    val type: ComponentType,
    val target: Target,
    val successEffects: MutableList<Effect>? = mutableListOf(),
    val failedEffects: MutableList<Effect>? = mutableListOf()
)
