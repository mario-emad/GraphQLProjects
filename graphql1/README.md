<h1>READ ME</h1>

<h2>GrapgQL calls</h2><br>
      query {
        getUser(id: 2) {
          name
          email
        }
      }<br>
      =======================<br>
      query {
        getAllUsers {
          id
          name
          email
        }
      }<br>
      =======================<br>
      mutation {
        createUser(name: "Ahmed", email: "Ahmed@yahoo.com") {
          id
          name
          email
        }
      }<br>
      =======================<br>
      mutation {
        deleteUser(id: 152)
      }
