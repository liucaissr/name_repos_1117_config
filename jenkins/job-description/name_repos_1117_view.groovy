 
listView('name_repos_1117 Jobs') {
    description('name_repos_1117 Jobs')
    jobs {
        regex('name_repos_1117_.+')
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
