import java.util.*


fun main() {

    val adj = arrayListOf<LinkedList<Int>>()

    for (i in 0..5) {
        adj.add(LinkedList<Int>())
        adj[i].add(i + 1)
    }

    adj[0].add(2)
    adj[1].add(4)
    adj[1].add(5)
    adj[1].add(6)
    adj[2].add(1)
    adj[3].add(3)
    adj[4].add(4)
    adj[4].add(6)
    adj[5].add(4)

    val visited = arrayOfNulls<Boolean>(adj.size + 1)

    for (i in 0..6)
    {
        visited[i] = false
    }

    for (i in adj)
    {
        for (j in i)
        {
            if (!visited[j]!!)
            {
                visited[j] = true
                println(j)
            }

        }
    }

}
