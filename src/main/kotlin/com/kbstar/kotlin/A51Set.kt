package com.kbstar.kotlin

import java.util.TreeSet

/*
    A = { 1, 1, 1, 2, 2, 3 } = {1, 2, 3 } = {2, 1, 3}
    Set : 중복을 허용하지 않는 자료구조
 */

fun main() {
    var set1 = setOf(1,1,1,2,2,3,"aa","aa", "bb", "bb", "cc")
    println("set1 = ${set1}")

    var intSet : Set<Int> = setOf<Int>(1,1,1,2,2,3)
    //intSet = intSet.toMutableSet()
    //intSet.add(4)

    var langSet = mutableSetOf("c", "java", "java")
    langSet.add("js")
    langSet.add("kotlin")
    langSet.add("c")
    langSet.remove("java")
    println("langSet = ${langSet}")

    /*
        HashSet : map처럼 키와 인덱스를 이용해서 검색이 매우 빠른 장점
            영어사전.. 매우 큰 데이터 처리
            맵..

        TreeSet: 데이터 저장될 때, 내부적으로 정렬 ==> 개선된 이진트리만든다.
            치우친 트리가 만들어 지지 않는다.
            HashSet에 비해서는 성능이 조금 떨어진다.
            추가, 삭제 시간많이 걸린다.
            정렬에 매우 효과적이다.

       LinkedHashSet : HashSet, TreeSet보다는 느리다.
            내부적으로 포인터연결을 하기 때문에 메모리 저장공간이 가장 효율적이다.

     */

    // HashSet은 Mutable
    var intHashSet: HashSet<Int> = hashSetOf(1, 3, 5, 4, 1, 1, 6, 5, 2, 2)
    intHashSet.add(7)
    intHashSet.add(1)
    intHashSet.add(1)

    println("intHashSet = ${intHashSet}")


    var intSortedSet : TreeSet<Int> = sortedSetOf(5, 3, 1, 7, 2, 2, 8, 4)
    println("intSortedSet = ${intSortedSet} ")


    var intLinkedHashSet : java.util.LinkedHashSet<Int> = linkedSetOf(3, 3, 1, 2, 4, 2, 5)
    intLinkedHashSet.add(7)
    println("intLinedHashSet = ${intLinkedHashSet}")
}