#!/usr/bin/perl
use strict;
use warnings;
#openning the passed SPF_smt file
  my $spfQueryFile = $ARGV[0];
  open(my $spfQ, '<:encoding(UTF-8)', $spfQueryFile)
  or die "Could not open file '$spfQueryFile' $!";

#create asserted_SMT_file for output
  my $assertedFile = "asserted" . $spfQueryFile;
  unless(open FILE, '>'.$assertedFile) {
      die "\nUnable to create $assertedFile\n";
  }

print FILE "(set-logic QF_BV)\n(set-option :produce-unsat-cores true)\n";
#while (my $row = <$spfQ>) {
#  print FILE "$row\n";
#}
my $charPosition = 0;
while (read $spfQ, my $char, 1) {
   if($charPosition > 7){
    print $assertedFile "$char";}
}

print "done\n";
