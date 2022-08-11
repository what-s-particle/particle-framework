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
    val drawRect: Rect? = null,
    val drawCircle: Circle? = null,
    val drawLine: Line? = null,
    val drawRoundRect: RoundRect? = null,
    val drawPath: Path? = null
)