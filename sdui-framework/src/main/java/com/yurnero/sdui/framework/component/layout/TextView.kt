package com.yurnero.sdui.framework.component.layout

import com.yurnero.sdui.framework.component.modifier.Color
import com.yurnero.sdui.framework.component.modifier.Weight
import kotlinx.serialization.Serializable

@Serializable
data class TextView(
    var text: String, var color: Color = Color.BLACK, var weight: Weight = Weight.REGULAR
)
