file://<HOME>/%D0%94%D0%BE%D0%BA%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8B/scala-projects/Notebook/containsNeg.scala
### java.lang.AssertionError: assertion failed: position not set for nn(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in <WORKSPACE>/containsNeg.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 253
uri: file://<HOME>/%D0%94%D0%BE%D0%BA%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8B/scala-projects/Notebook/containsNeg.scala
text:
```scala
def containsNeg(nums: List[Int]): Boolean =
    var exists = false
    for num <- nums do
        if num < 0 then
            exists = true
    exists

// Снизу ПРАВИЛЬНАЯ версия, лакончиная

def containsNeglac(nums: List[Int]): Boolean = nums.exists(_.@@)

```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.typer.Typer$.assertPositioned(Typer.scala:72)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3297)
	dotty.tools.dotc.typer.Applications.extMethodApply(Applications.scala:2483)
	dotty.tools.dotc.typer.Applications.extMethodApply$(Applications.scala:400)
	dotty.tools.dotc.typer.Typer.extMethodApply(Typer.scala:119)
	dotty.tools.dotc.typer.Applications.tryApplyingExtensionMethod(Applications.scala:2528)
	dotty.tools.dotc.typer.Applications.tryApplyingExtensionMethod$(Applications.scala:400)
	dotty.tools.dotc.typer.Typer.tryApplyingExtensionMethod(Typer.scala:119)
	dotty.tools.dotc.interactive.Completion$Completer.tryApplyingReceiverToExtension$1(Completion.scala:526)
	dotty.tools.dotc.interactive.Completion$Completer.$anonfun$23(Completion.scala:569)
	scala.collection.immutable.List.flatMap(List.scala:294)
	scala.collection.immutable.List.flatMap(List.scala:79)
	dotty.tools.dotc.interactive.Completion$Completer.extensionCompletions(Completion.scala:566)
	dotty.tools.dotc.interactive.Completion$Completer.selectionCompletions(Completion.scala:446)
	dotty.tools.dotc.interactive.Completion$.computeCompletions(Completion.scala:218)
	dotty.tools.dotc.interactive.Completion$.rawCompletions(Completion.scala:78)
	dotty.tools.pc.completions.Completions.enrichedCompilerCompletions(Completions.scala:114)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:136)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:139)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:150)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: position not set for nn(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in <WORKSPACE>/containsNeg.scala