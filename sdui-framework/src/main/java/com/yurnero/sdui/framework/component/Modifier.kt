package com.yurnero.sdui.framework.component

import com.yurnero.sdui.framework.component.basic.Draw
import com.yurnero.sdui.framework.component.graphics.Border
import com.yurnero.sdui.framework.component.graphics.ColorToken
import com.yurnero.sdui.framework.component.graphics.Shadow
import com.yurnero.sdui.framework.component.graphics.SizeToken
import com.yurnero.sdui.framework.component.layout.FillToken
import com.yurnero.sdui.framework.component.layout.PaddingModifier
import kotlinx.serialization.Serializable

@Serializable
data class Modifier(
    var backgroundColor: ColorToken?,
    var visibility: Boolean?,
    var padding: PaddingModifier?,
    var roundedCorner: SizeToken?,
    var widthValue: Double?,
    var heightValue: Double?,
    var fillToken: FillToken?,
    var border: Border?,
    var shadow: Shadow?,
    var priority: Int?,
    var weight: Float?,
    var drawBefore: Draw?,
    var drawBehind: Draw?
)
