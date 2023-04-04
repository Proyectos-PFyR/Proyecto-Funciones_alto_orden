import ConjuntosDifusos._

val mm1= muchoMayorQue(1 , 3)
val mm2= muchoMayorQue(2 , 6)

mm1(1000)

val mmg = grande(1, 10)
mmg(1000)

val enteros = 1 to 1000
val valList = enteros.toList

inclusion(mmg, mm1)
igualdad(mm1, mm1)