file://<HOME>/%D0%94%D0%BE%D0%BA%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8B/scala-projects/Notebook/FileMatcher.scala
### java.lang.AssertionError: assertion failed: NoType

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 441
uri: file://<HOME>/%D0%94%D0%BE%D0%BA%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8B/scala-projects/Notebook/FileMatcher.scala
text:
```scala
object FileMatcher:
    private def filesHere = (new java.io.File(".")).listFiles

    private def filesMatching(matcher: String => Boolean) =
        for file <- filesHere if matcher(file.getName)
        yield file

    def filesEnding(query: String) =
        filesMatching(_.endsWith(query))

    def filesContaining(query: String) =
        filesMatching(_.contains(query))

    def filesRegex(query: String) =
        filesMatching(_.m@@)

```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.core.Types$TypeBounds.<init>(Types.scala:5229)
	dotty.tools.dotc.core.Types$AliasingBounds.<init>(Types.scala:5308)
	dotty.tools.dotc.core.Types$TypeAlias.<init>(Types.scala:5330)
	dotty.tools.dotc.core.Types$TypeAlias$.apply(Types.scala:5367)
	dotty.tools.dotc.core.Types$Type.bounds(Types.scala:1781)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:280)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:351)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:122)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:139)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:150)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: NoType