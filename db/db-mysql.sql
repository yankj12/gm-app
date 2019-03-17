

CREATE TABLE
    url_rec
    (
        id BIGINT NOT NULL AUTO_INCREMENT,
        tid VARCHAR(60) DEFAULT '',
        host VARCHAR(140) DEFAULT '',
        rurl VARCHAR(255) DEFAULT '',
        title VARCHAR(255) DEFAULT '',
		validStatus VARCHAR(2) DEFAULT '1',
        insertTime DATETIME,
        updateTime DATETIME,
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE INDEX idx_url_rec_tid ON url_rec (tid);
CREATE INDEX idx_url_rec_title ON url_rec (title);

CREATE TABLE
    url_ext
    (
        id BIGINT NOT NULL AUTO_INCREMENT,
        tid VARCHAR(60) DEFAULT '',
        host VARCHAR(140) DEFAULT '',
        category VARCHAR(60) DEFAULT '',
		validStatus VARCHAR(2) DEFAULT '1',
        insertTime DATETIME,
        updateTime DATETIME,
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE INDEX idx_url_ext_tid ON url_ext (tid);

