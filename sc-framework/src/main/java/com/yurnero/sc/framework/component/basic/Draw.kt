package com.yurnero.sc.framework.component.basic

import com.yurnero.sc.framework.component.geometry.Circle
import com.yurnero.sc.framework.component.geometry.Line
import com.yurnero.sc.framework.component.geometry.Path
import com.yurnero.sc.framework.component.geometry.Rect
import com.yurnero.sc.framework.component.geometry.RoundRect
import kotlinx.serialization.Serializable


/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Draw(
    var drawRect: Rect? = null,
    var drawCircle: Circle? = null,
    var drawLine: Line? = null,
    var drawRoundRect: RoundRect? = null,
    var drawPath: Path? = null
)
