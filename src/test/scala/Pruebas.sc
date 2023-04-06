import ConjuntosDifusos.{pertenece, _}

/******************************************************************************
 * FUNCIÓN:                muchoMayorQue
 ******************************************************************************/
val auxMayorQue1 = muchoMayorQue(1, 3)
val auxMayorQue2 = muchoMayorQue(12, 46)
val auxMayorQue3 = muchoMayorQue(10, 100)
val auxMayorQue4 = muchoMayorQue(8, 19)
val auxMayorQue5 = muchoMayorQue(2, 6)

auxMayorQue1(1)
auxMayorQue1(2)
auxMayorQue1(190)

auxMayorQue2(12)
auxMayorQue2(30)
auxMayorQue2(465)

auxMayorQue3(10)
auxMayorQue3(50)
auxMayorQue3(100)

auxMayorQue4(7)
auxMayorQue4(17)
auxMayorQue4(20)

auxMayorQue5(1)
auxMayorQue5(3)
auxMayorQue5(12)

/******************************************************************************
 * FUNCIÓN:                cercanosA
 ******************************************************************************/
val auxCercano1 = cercanosA(6, 156)
val auxCercano2 = cercanosA(9, 34)
val auxCercano3 = cercanosA(7, 65)
val auxCercano4 = cercanosA(1, 5)
val auxCercano5 = cercanosA(4, 16)

auxCercano1(6)
auxCercano1(56)
auxCercano1(200)

auxCercano2(9)
auxCercano2(15)
auxCercano2(37)

auxCercano3(4)
auxCercano3(54)
auxCercano3(87)

auxCercano4(1)
auxCercano4(4)
auxCercano4(9)

auxCercano5(3)
auxCercano5(11)
auxCercano5(20)

/******************************************************************************
 * FUNCIÓN:                grande
 ******************************************************************************/
val auxGrande1 = grande(1, 10)
val auxGrande2 = grande(30, 10)
val auxGrande3 = grande(6, 10)
val auxGrande4 = grande(10, 10)
val auxGrande5 = grande(8, 10)

auxGrande1(1)
auxGrande1(20)
auxGrande1(300)

auxGrande2(5)
auxGrande2(25)
auxGrande2(45)

auxGrande3(1)
auxGrande3(10)
auxGrande3(100)

auxGrande4(15)
auxGrande4(34)
auxGrande4(100)

auxGrande5(14)
auxGrande5(145)
auxGrande5(1456)

/******************************************************************************
 * FUNCIÓN:                igualdad
 ******************************************************************************/
igualdad(auxGrande1, auxGrande1)
igualdad(auxCercano2, auxMayorQue3)
igualdad(auxCercano3, auxGrande5)
igualdad(auxGrande4, auxMayorQue5)
igualdad(auxCercano3, auxMayorQue1)

/******************************************************************************
 * FUNCIÓN:                inclusion
 ******************************************************************************/
inclusion(auxGrande2, auxGrande1)
inclusion(auxCercano2, auxMayorQue3)
inclusion(auxCercano3, auxGrande5)
inclusion(auxGrande4, auxMayorQue5)
inclusion(auxCercano3, auxMayorQue1)