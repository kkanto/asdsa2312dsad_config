 
listView('asdsa2312dsad Jobs') {
    description('asdsa2312dsad Jobs')
    jobs {
        regex('asdsa2312dsad_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
