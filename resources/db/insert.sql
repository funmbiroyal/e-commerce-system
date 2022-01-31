set foreign_key_checks = 0;

truncate  table product;

insert into product (`id`,`name`,`description`,`cost`,`image`)
values(001,'bag','fashion bag',$6),
      (001,'shoe','baby shoe',$8),
      (001,'weavon','brazilian hair',$21),
      (001,'wristwatch','golden watch',$19);

set foreign checks = 1;