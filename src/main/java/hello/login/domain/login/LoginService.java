package hello.login.domain.login;

import hello.login.domain.member.Member;

public interface LoginService {
    Member login(String loginId, String password);
}
