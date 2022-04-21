import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor(private libraryservice:LibraryService) 
  {}

  ngOnInit(): void {
  }
  update(updateform:any)
  {
    this.libraryservice.bookservice(updateform.value).subscribe();
  }
}

