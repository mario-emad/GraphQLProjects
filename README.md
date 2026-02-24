<h1>READ ME</h1>

**GrapgQL calls**
      query {
        getUser(id: 2) {
          name
          email
        }
      }
      =======================
      query {
        getAllUsers {
          id
          name
          email
        }
      }
      =======================
      mutation {
        createUser(name: "Ahmed", email: "Ahmed@yahoo.com") {
          id
          name
          email
        }
      }
      =======================
      mutation {
        deleteUser(id: 152)
      }
