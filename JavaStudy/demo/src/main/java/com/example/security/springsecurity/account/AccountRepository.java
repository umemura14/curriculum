package com.example.security.springsecurity.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//問２－１ リポジトリを作成するアノテーションを記述
//DBとやり取りするクラスに付与(ユーザーネームでの検索)
@Repository

public interface AccountRepository extends CrudRepository<Account, Long> {
    public Account findByUsername(String username);
    public List<Account> findAll();
}