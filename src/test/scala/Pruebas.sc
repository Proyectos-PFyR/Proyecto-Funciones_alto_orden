import ConjuntosDifusos.{pertenece, _}

/******************************************************************************
 * FUNCIÓN:                muchoMayorQue
 ******************************************************************************/
val auxMayorQue1 = muchoMayorQue(1, 3)
val auxMayorQue2 = muchoMayorQue(12, 46)
val auxMayorQue3 = muchoMayorQue(10, 100)
val auxMayorQue4 = muchoMayorQue(8, 19)
val auxMayorQue5 = muchoMayorQue(2, 6)

auxMayorQue1(5)
auxMayorQue2(465)
auxMayorQue3(83)
pertenece(3, auxMayorQue4)
pertenece(7, auxMayorQue5)

/******************************************************************************
 * FUNCIÓN:                cercanosA
 ******************************************************************************/
val auxCercano1 = cercanosA(6, 156)
val auxCercano2 = cercanosA(9, 34)
val auxCercano3 = cercanosA(7, 65)
val auxCercano4 = cercanosA(1, 5)
val auxCercano5 = cercanosA(4, 16)

auxCercano1(56)
auxCercano2(37)
auxCercano3(54)
pertenece(4, auxCercano4)
pertenece(20, auxCercano5)

/******************************************************************************
 * FUNCIÓN:                grande
 ******************************************************************************/
val auxGrande1 = grande(1, 10)
val auxGrande2 = grande(30, 10)
val auxGrande3 = grande(6, 10)
val auxGrande4 = grande(10, 10)
val auxGrande5 = grande(8, 10)

auxGrande1(30)
auxGrande2(5)
auxGrande3(24)
pertenece(11, auxGrande4)
pertenece(14, auxGrande5)