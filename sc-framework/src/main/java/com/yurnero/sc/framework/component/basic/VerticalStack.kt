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
    var elements: MutableList<Component> = mutableListOf(),
    var arrangement: ArrangementToken = ArrangementToken.CENTER,
    var alignment: AlignmentToken = AlignmentToken.CENTER_VERTICALLY
)
