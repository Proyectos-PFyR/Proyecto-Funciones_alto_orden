package object ConjuntosDifusos
{
  /******************************************************************************
   * Funciones Entregadas por el profesor.
   ******************************************************************************/
  type ConjDifuso = Int => Double

  def pertenece(x: Int, cd: ConjDifuso): Double =
  {
    cd(x)
  }

  def muchoMayorQue(a: Int, m: Int): ConjDifuso =
  {
    def mma (x: Int): Double =
    {
      if (x <= a)
      0.0
      else if (x > a && x <= m)(x - a).toDouble / (m - a).toDouble
      else 1.0
    }
    mma
  }

  def cercanosA(a: Int, k: Int): ConjDifuso =
  {
    def ca(x: Int): Double =
    {
      val q = 1.0 + k * (x - a) * (x - a)
      1 / q
    }
    ca
  }

  /******************************************************************************
   * FUNCIÓN:                grande
   * DESCRIPCIÓN:            Función que retorna el grado de pertenencia de un numero segun lo grande que es respecto a d.
   * PARÁMETROS DE ENTRADA
   * $d :                    Numero mayor o igual a 1 con el cual se comparara lo grande que es el numero x.
   * $e :                    Numero mayor a 1 con el cual se mejora la calidad del grado de pertenencia.
   * RETORNO
   * ConjDifuso :  			     Funcion caracteristica del conjunto difuso.
   * *****************************************************************************/
  def grande(d: Int, e: Int): ConjDifuso =
  {
    def auxGrande(x: Int): Double =
    {
      math.pow(x.toDouble / (x + d).toDouble, e.toDouble)
    }
    auxGrande
  }

  /** ****************************************************************************
   * FUNCIÓN:                complemento
   * DESCRIPCIÓN:            Función que retorna el grado de no pertenencia de un elemento al conjunto de Entrada
   * PARÁMETROS DE ENTRADA
   * $cd1:                  Funcion del conjunto difuso #1.
   * RETORNO
   * ConjDifuso:  			     El complemento del primer conjunto.
   * **************************************************************************** */
  def complemento(cd: ConjDifuso): ConjDifuso =
  {
    def auxComplemento(x: Int): Double =
    {
      1 - cd(x)
    }
    auxComplemento
  }

  /** ****************************************************************************
   * FUNCIÓN:                union
   * DESCRIPCIÓN:            Función que retorna el grado de mayor pertenencia de un elemento entre los dos conjuntos
   * PARÁMETROS DE ENTRADA
   * $cd1:                  Funcion del conjunto difuso #1.
   * $cd2:                  Funcion del conjunto difuso #2.
   * RETORNO
   * ConjDifuso:  			     La union de ambos conjuntos
   * **************************************************************************** */
  def union(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso =
  {
    def auxUnion(x: Int): Double =
    {
      val gp1 = cd1(x)
      val gp2 = cd2(x)

      if(gp1 >= gp2)
      {
        gp1
      }
      else
      {
        gp2
      }
    }
    auxUnion
  }

  /** ****************************************************************************
   * FUNCIÓN:                interseccion
   * DESCRIPCIÓN:            Función que retorna el grado de menor pertenencia de un elemento entre los dos conjuntos
   * PARÁMETROS DE ENTRADA
   * $cd1:                  Funcion del conjunto difuso #1.
   * $cd2:                  Funcion del conjunto difuso #2.
   * RETORNO
   * ConjDifuso:  			     La interseccion de ambos conjuntos
   * **************************************************************************** */
  def interseccion(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso = {
    def fu(x: Int): Double = {
      val fs1 = cd1(x)
      val fs2 = cd2(x)
      if (fs1 > fs2) fs2
      else fs1
    }

    fu
  }

  /******************************************************************************
   * FUNCIÓN:                inclusion
   * DESCRIPCIÓN:            Función que devuelve un boolean indicando si el conjunto difuso cd1 esta incluido en el conjunto difuso cd2.
   * PARÁMETROS DE ENTRADA
   * $cd1 :                  Funcion del conjunto difuso #1.
   * $cd2 :                  Funcion del conjunto difuso #2.
   * RETORNO
   * boolean :  			       True o False.
   * *****************************************************************************/
  def inclusion(cd1: ConjDifuso, cd2: ConjDifuso): Boolean =
  {
    //Se establece como el limite inferior del intervalo como 1.
    val inicio = 1;
    //Se establece como el limite inferior del intervalo como 2.
    val fin = 1000;

    def auxInclusion(i: Int, f: Int, cd1: ConjDifuso, cd2: ConjDifuso): Boolean =
    {
      //Si el grado de pertenencia de algun valor i no es mayor en cd1 que en cd2, la funcion retorna false.
      println("CD1: " + cd1(i) + " " + "CD2: " + cd2(i))
      if(cd1(i) > cd2(i))
      {
        false
      }
      else
      {
        //Si el valor i es igual al limite superior entonces ya se analizaron todos los numeros en inicio y fin y no se encontro ningun grado de pertenencia que no fuera igual, por ende la funcion retorna true.
        if (i == f)
        {
          true
        }
        //Si el valor i no es igual al limite superior entonces aun quedan valores por analiza. Por ende se hace un llamado recursivo de la funcion mmi.
        else
        {
          auxInclusion(i + 1: Int, f: Int, cd1: ConjDifuso, cd2: ConjDifuso)
        }
      }
    }
    auxInclusion(inicio, fin, cd1, cd2)
  }

  /******************************************************************************
   * FUNCIÓN:                igualdad
   * DESCRIPCIÓN:            Función que devuelve un boolean indicando si los 2 conjuntos difusos son iguales.
   * PARÁMETROS DE ENTRADA
   * $cd1 :                  Funcion del conjunto difuso #1.
   * $cd2 :                  Funcion del conjunto difuso #2.
   * RETORNO
   * boolean :  			       True o False.
   * *****************************************************************************/
  def igualdad(cd1: ConjDifuso, cd2: ConjDifuso): Boolean =
  {
    //Se establece como el limite inferior del intervalo como 1.
    val inicio = 1;
    //Se establece como el limite inferior del intervalo como 2.
    val fin = 1000;

    //Se define la funcion auxiliar mmi.
    def auxIgualdad(i: Int, f: Int, cd1: ConjDifuso, cd2: ConjDifuso): Boolean =
    {
      //Si el grado de peretnencia de algun valor i no es igual entre el cd1 y el cd2, la funcion retorna false.
      println("CD1: " + cd1(i) + " " + "CD2: " + cd2(i))
      if (cd1(i) != cd2(i))
      {
        false
      }
      else
      {
        //Si el valor i es igual al limite superior entonces ya se analizaron todos los numeros en inicio y fin y no se encontro ningun grado de pertenencia que no fuera igual, por ende la funcion retorna true.
        if (i == f)
        {
          true
        }
        //Si el valor i no es igual al limite superior entonces aun quedan valores por analiza. Por ende se hace un llamado recursivo de la funcion mmi.
        else
        {
          auxIgualdad(i + 1: Int, f: Int, cd1: ConjDifuso, cd2: ConjDifuso)
        }
      }
    }
    auxIgualdad(inicio, fin, cd1, cd2)
  }
}
