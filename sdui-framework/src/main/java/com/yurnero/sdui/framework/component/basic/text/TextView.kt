package com.yurnero.sdui.framework.component.basic.text

import com.yurnero.sdui.framework.component.graphics.ColorToken
import com.yurnero.sdui.framework.component.graphics.SizeToken
import kotlinx.serialization.Serializable

@Serializable
data class TextView(
    val text: String,
    val colorToken: ColorToken?,
    val colorValue: Int?,
    val weightToken: FontWeightToken?,
    val sizeToken: SizeToken?,
    val sieValue: Double?,
    val styleToken: FontStyleToken?,
    val familyToken: FontFamilyToken?,
    val textDecoration: MutableList<TextDecorationToken>?,
    val textAlignment: TextAlignmentToken?,
    val maxLine: Int?
)
