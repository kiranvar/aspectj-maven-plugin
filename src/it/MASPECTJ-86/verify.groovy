file = new File(basedir, "build.log")
assert file.exists()
assert !file.getText().contains("No sources found skipping aspectJ compile")
ajcOptionsfile = new File(basedir, "target/classes/builddef.lst")
assert file.exists()
