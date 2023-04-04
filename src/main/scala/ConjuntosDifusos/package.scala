package object ConjuntosDifusos
{
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

  def grande(d: Int, e: Int): ConjDifuso =
  {
    def mmg(x: Int): Double =
    {
      if(x == x + d)
      {
       1.0
      }
      else if(x <= d)
      {
        0.0
      }
      else
      {
        math.pow(x.toDouble / (x + d).toDouble, e.toDouble)
      }
    }
    mmg
  }

  def complemento(cd: ConjDifuso): ConjDifuso = {
    def fc(x: Int): Double = {
      1 - cd(x)
    }

    fc
  }

  def union(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso = {
    def fu(x: Int): Double = {
      val fs1 = cd1(x)
      val fs2 = cd2(x)
      if (fs1 >= fs2) fs1
      else fs2
    }

    fu
  }

  def interseccion(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso = {
    def fu(x: Int): Double = {
      val fs1 = cd1(x)
      val fs2 = cd2(x)
      if (fs1 > fs2) fs2
      else fs1
    }

    fu
  }


  def inclusion(cd1: ConjDifuso, cd2: ConjDifuso): Boolean =
  {
    val inicio = 1;
    val fin = 1000;

    def mmi(i: Int, f: Int, cd1: ConjDifuso, cd2: ConjDifuso): Boolean =
    {
      if(cd1(i) > cd2(i))
      {
        false
      }
      else
      {
        if(i == f)
        {
          true
        }
        else
        {
          mmi(i + 1: Int, f: Int, cd1: ConjDifuso, cd2: ConjDifuso)
        }
      }
    }
    mmi(inicio, fin, cd1, cd2)
  }

  def igualdad(cd1: ConjDifuso, cd2: ConjDifuso): Boolean =
  {
    val inicio = 1;
    val fin = 1000;

    def mmi(i: Int, f: Int, cd1: ConjDifuso, cd2: ConjDifuso): Boolean =
    {
      if (cd1(i) != cd2(i))
      {
        false
      }
      else
      {
        if (i == f)
        {
          true
        }
        else
        {
          mmi(i + 1: Int, f: Int, cd1: ConjDifuso, cd2: ConjDifuso)
        }
      }
    }
    mmi(inicio, fin, cd1, cd2)
  }
}
