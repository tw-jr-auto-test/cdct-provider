package person

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    inProgress()
    description "should return person by id=1"

    request {
        url "/person/1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body (
                id: $(anyNumber()),
                name: "foo",
                surname: "bee"
        )
    }
}