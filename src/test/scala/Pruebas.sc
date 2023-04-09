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
 * FUNCIÓN:                complemento
 ******************************************************************************/

val auxComplemento1 = complemento(auxMayorQue3)
auxComplemento1(4)
auxComplemento1(50)
auxComplemento1(110)

val auxComplemento2 = complemento(auxCercano2)
auxComplemento2(9)
auxComplemento2(7)
auxComplemento2(50)

val auxComplemento3 = complemento(auxGrande4)
auxComplemento2(20)
auxComplemento2(50)
auxComplemento2(110)

/******************************************************************************
 * FUNCIÓN:                union
 ******************************************************************************/

val auxUnion1 = union(auxMayorQue1, auxMayorQue2)
auxUnion1(2)
auxUnion1(1)
auxUnion1(16)

val auxUnion2 = union(auxMayorQue2, auxGrande1)
auxUnion2(100)
auxUnion2(14)
auxUnion2(46)

/******************************************************************************
 * FUNCIÓN:                interseccion
 ******************************************************************************/

val auxInterseccion1 = union(auxMayorQue1, auxMayorQue2)
auxInterseccion1(2)
auxInterseccion1(1)
auxInterseccion1(16)

val auxInterseccion2 = union(auxMayorQue2, auxGrande1)
auxInterseccion2(100)
auxInterseccion2(14)
auxInterseccion2(46)

/******************************************************************************
 * FUNCIÓN:                inclusion
 ******************************************************************************/
inclusion(auxGrande2, auxGrande1)
inclusion(auxCercano2, auxMayorQue3)
inclusion(auxCercano3, auxGrande5)
inclusion(auxGrande4, auxMayorQue5)
inclusion(auxMayorQue1, auxCercano5)

/******************************************************************************
 * FUNCIÓN:                igualdad
 ******************************************************************************/
igualdad(auxGrande1, auxGrande1)
igualdad(auxGrande3, auxCercano1)
igualdad(auxCercano4, auxMayorQue2)
igualdad(auxMayorQue4, auxGrande1)
igualdad(auxMayorQue1, auxMayorQue5)
