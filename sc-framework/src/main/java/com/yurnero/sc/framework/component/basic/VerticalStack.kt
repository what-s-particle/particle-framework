package com.yurnero.sc.framework.component.basic

import com.yurnero.sc.framework.component.layout.AlignmentToken
import com.yurnero.sc.framework.component.layout.ArrangementToken
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class VerticalStack(
    val elements: MutableList<Component> = mutableListOf(),
    val arrangement: ArrangementToken?,
    val alignment: AlignmentToken?
)