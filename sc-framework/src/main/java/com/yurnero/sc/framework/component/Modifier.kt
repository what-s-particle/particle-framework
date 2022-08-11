package com.yurnero.sc.framework.component

import com.yurnero.sc.framework.component.basic.Draw
import com.yurnero.sc.framework.component.graphics.Border
import com.yurnero.sc.framework.component.graphics.ColorToken
import com.yurnero.sc.framework.component.graphics.Shadow
import com.yurnero.sc.framework.component.graphics.SizeToken
import com.yurnero.sc.framework.component.layout.FillToken
import com.yurnero.sc.framework.component.layout.PaddingModifier
import kotlinx.serialization.Serializable

@Serializable
data class Modifier(
    var backgroundColor: ColorToken? = null,
    var visibility: Boolean? = null,
    var padding: PaddingModifier? = null,
    var roundedCorner: SizeToken? = null,
    var widthValue: Double? = null,
    var heightValue: Double? = null,
    var fillToken: FillToken? = null,
    var border: Border? = null,
    var shadow: Shadow? = null,
    var priority: Int? = null,
    var weight: Float? = null,
    var drawBefore: Draw? = null,
    var drawBehind: Draw? = null
)
