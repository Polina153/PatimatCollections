import java.lang.IndexOutOfBoundsException

class MyArrayList : MyList {

    var array = arrayOfNulls<String>(10)
    var size = 0

    override fun get(index: Int): String {
        if (index in 0 until size) {
            array[index]?.let {
                return it
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(string: String) {
        if (size >= array.size) {
            array = array.copyOf(array.size * 2)
        }
        array[size] = string
        size++
    }

    override fun remove(element: String) {
        TODO("Not yet implemented")
    }

    override fun removeAt(index: Int) {
        TODO("Not yet implemented")
    }

    override fun size(): Int {
        return size
    }
}