file://<HOME>/%D0%94%D0%BE%D0%BA%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8B/scala-projects/rational-project/Rational.scala
### dotty.tools.dotc.ast.Trees$UnAssignedTypeException: type of Apply(Ident(Rational),List(Ident(x))) is not assigned

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
uri: file://<HOME>/%D0%94%D0%BE%D0%BA%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8B/scala-projects/rational-project/Rational.scala
text:
```scala
class Rational(n: Int, d: Int):

    require(d != 0)

    private val g = gcd(n.abs, d.abs)
    val numer = n / g
    val denom = d / g

    def this(n: Int) = this(n,1)


    def + (that: Rational): Rational =
        Rational(
            numer * that.denom + that.numer * denom, 
            denom * that.denom
        )
    
    def + (i: Int): Rational =
        Rational(numer + i * denom, denom)

    def - (that: Rational): Rational =
        Rational(
            numer * that.denom - that.numer * denom, 
            denom * that.denom
        )

    def - (i: Int): Rational =
        Rational(numer - i * denom, denom)


    def * (that: Rational): Rational =
        Rational(numer * that.numer, denom * that.denom)

    def * (i: Int): Rational =
        Rational(numer * i, denom)

    def / (that: Rational): Rational =
        Rational(
            numer * that.denom, denom * that.numer
        )

    def / (i: Int): Rational =
        Rational(numer, denom * i)

    extension (x: Int)
        def + (y: Rational) = Rational(x) + y
        def - (y: Rational) = Rational(x) - y
        def * (y: Rational) = Rational(x) * y
        def / (y: Rational) = Rational(x) / y

    
    override def toString = s"$numer/$denom"

    private def gcd(a: Int, b: Int): Int =
        if b == 0 then
            a
        else
            gcd(b, a % b)

    
        

@main def m() =
    println(2 )
    

```



#### Error stacktrace:

```
dotty.tools.dotc.ast.Trees$Tree.tpe(Trees.scala:74)
	dotty.tools.dotc.typer.ConstFold$ConstantTree$.unapply(ConstFold.scala:67)
	dotty.tools.dotc.typer.ConstFold$.Apply(ConstFold.scala:31)
	dotty.tools.dotc.typer.ConstFold$.apply(ConstFold.scala:54)
	dotty.tools.dotc.typer.Applications.typedApply(Applications.scala:1207)
	dotty.tools.dotc.typer.Applications.typedApply$(Applications.scala:400)
	dotty.tools.dotc.typer.Typer.typedApply(Typer.scala:119)
	dotty.tools.dotc.typer.Typer.typedInfixOp(Typer.scala:3035)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3190)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3232)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3302)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3306)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3417)
	dotty.tools.dotc.typer.Namer.typedAheadExpr$$anonfun$1(Namer.scala:1705)
	dotty.tools.dotc.typer.Namer.typedAhead(Namer.scala:1695)
	dotty.tools.dotc.typer.Namer.typedAheadExpr(Namer.scala:1705)
	dotty.tools.dotc.typer.Namer.typedAheadRhs$1$$anonfun$1(Namer.scala:1959)
	dotty.tools.dotc.inlines.PrepareInlineable$.dropInlineIfError(PrepareInlineable.scala:242)
	dotty.tools.dotc.typer.Namer.typedAheadRhs$1(Namer.scala:1959)
	dotty.tools.dotc.typer.Namer.rhsType$1(Namer.scala:1967)
	dotty.tools.dotc.typer.Namer.cookedRhsType$1(Namer.scala:1990)
	dotty.tools.dotc.typer.Namer.lhsType$1(Namer.scala:1991)
	dotty.tools.dotc.typer.Namer.inferredResultType(Namer.scala:2002)
	dotty.tools.dotc.typer.Namer.inferredType$1(Namer.scala:1743)
	dotty.tools.dotc.typer.Namer.valOrDefDefSig(Namer.scala:1750)
	dotty.tools.dotc.typer.Namer.defDefSig(Namer.scala:1841)
	dotty.tools.dotc.typer.Namer$Completer.typeSig(Namer.scala:805)
	dotty.tools.dotc.typer.Namer$Completer.completeInCreationContext(Namer.scala:954)
	dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:828)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:188)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:190)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.ensureCompleted(SymDenotations.scala:392)
	dotty.tools.dotc.typer.Typer.retrieveSym(Typer.scala:3092)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3117)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3231)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3302)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3306)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3328)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3374)
	dotty.tools.dotc.typer.Typer.typedClassDef(Typer.scala:2771)
	dotty.tools.dotc.typer.Typer.typedTypeOrClassDef$1(Typer.scala:3139)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3143)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3231)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3302)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3306)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3328)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3374)
	dotty.tools.dotc.typer.Typer.typedPackageDef(Typer.scala:2914)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3184)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3232)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3302)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3306)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3417)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$1(TyperPhase.scala:45)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:467)
	dotty.tools.dotc.typer.TyperPhase.typeCheck(TyperPhase.scala:51)
	dotty.tools.dotc.typer.TyperPhase.$anonfun$4(TyperPhase.scala:97)
	scala.collection.Iterator$$anon$6.hasNext(Iterator.scala:479)
	scala.collection.Iterator$$anon$9.hasNext(Iterator.scala:583)
	scala.collection.immutable.List.prependedAll(List.scala:152)
	scala.collection.immutable.List$.from(List.scala:685)
	scala.collection.immutable.List$.from(List.scala:682)
	scala.collection.IterableOps$WithFilter.map(Iterable.scala:900)
	dotty.tools.dotc.typer.TyperPhase.runOn(TyperPhase.scala:96)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:315)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1324)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:308)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:348)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:357)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:69)
	dotty.tools.dotc.Run.compileUnits(Run.scala:357)
	dotty.tools.dotc.Run.compileSources(Run.scala:261)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:161)
	dotty.tools.pc.CachingDriver.run(CachingDriver.scala:45)
	dotty.tools.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:32)
	dotty.tools.pc.ScalaPresentationCompiler.semanticdbTextDocument$$anonfun$1(ScalaPresentationCompiler.scala:242)
```
#### Short summary: 

dotty.tools.dotc.ast.Trees$UnAssignedTypeException: type of Apply(Ident(Rational),List(Ident(x))) is not assigned