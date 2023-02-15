<nav class="navbar navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">Adlister</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
            <div class="offcanvas-header">
                <h5 class="offcanvas-title" id="offcanvasNavbarLabel">Welcome ${sessionScope.user.username}</h5>
                <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
            </div>
            <div class="offcanvas-body">
                <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/profile">Profile</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="/ads">All Ads</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="/ads/create">Create Ad</a>
                    </li>

                    <div class="d-grid gap-2 d-md-block">
                        <a class="btn btn-primary" href="/login" role="button">Login</a>
                        <a class="btn btn-primary" href="/logout" role="button">Logout</a>
                    </div>
                </ul>

            </div>
        </div>
    </div>
</nav>