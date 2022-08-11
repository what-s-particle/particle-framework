package com.yurnero.sc.framework.component.route

import kotlinx.serialization.Serializable


/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Whole(
    val screens: MutableList<Screen> = mutableListOf()
)
