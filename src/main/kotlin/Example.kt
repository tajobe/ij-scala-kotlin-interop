import io.shiftleft.codepropertygraph.generated.Cpg
import io.shiftleft.codepropertygraph.generated.CpgNodeStarters
import io.shiftleft.codepropertygraph.generated.nodes.Call
import io.shiftleft.codepropertygraph.generated.traversals.`TraversalCallBase$`
import sttp.client4.BackendOptions
import sttp.client4.DefaultSyncBackend
import sttp.client4.quick.quickRequest
import sttp.model.Uri
import java.net.URI

fun main() {
    `TraversalCallBase$`.`MODULE$`.`methodFullName$extension`<Call>(CpgNodeStarters(Cpg.empty()).call(), "com.example.fullName")

    val uri = Uri.apply(URI("http://httpbin.org/ip"))
    val backend = DefaultSyncBackend.apply(BackendOptions.Default())
    val response = quickRequest().get(uri).send(backend)
    println(response.code())
}
